public int descriptionEdit(webdoctor.jooq.tables.pojos.Disease disease) {
    if ((checkDisease(disease)) == 0) {
        return 0;
    }else {
        java.lang.System.out.println(disease.getDescription());
        create.update(webdoctor.service.DISEASE).set(DISEASE.DESCRIPTION, disease.getDescription()).where(DISEASE.NAME.equal(disease.getName())).execute();
        return 1;
    }
}