@com.google.common.annotations.VisibleForTesting
void checkOutputFormatWithDescriptionFormat(org.n52.sos.ds.hibernate.entities.Procedure procedure, java.lang.String requested, java.lang.String descriptionFormat) throws org.n52.sos.ogc.ows.OwsExceptionReport {
    if (((!(requested.equalsIgnoreCase(descriptionFormat))) && (!((isSensorMLFormat(descriptionFormat)) && (isSensorMLFormat(requested))))) && (!(existConverter(descriptionFormat, requested)))) {
        throw new org.n52.sos.exception.ows.InvalidParameterValueException().at(SosConstants.DescribeSensorParams.procedure).withMessage("The value of the output format is wrong and has to be %s for procedure %s", descriptionFormat, procedure.getIdentifier()).setStatus(HTTPStatus.BAD_REQUEST);
    }
}