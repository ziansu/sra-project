public static void shallowCopy(com.gallatinsystems.framework.domain.BaseDomain source, com.gallatinsystems.framework.domain.BaseDomain copy) {
    org.springframework.beans.BeanUtils.copyProperties(source, copy, Constants.EXCLUDED_PROPERTIES);
    java.lang.String kind = source.getKey().getKind();
    com.gallatinsystems.survey.dao.SurveyUtils.log.log(java.util.logging.Level.INFO, ((("Copying `" + kind) + "` ") + (source.getKey().getId())));
}