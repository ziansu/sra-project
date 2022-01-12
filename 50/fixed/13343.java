public java.lang.String getLastIdLib() {
    for (cf.dashika.pipetteworld.Model.Adobe.Library library : libraries) {
        if ((library.getId()) != null)
            return library.getId();
        
    }
    return null;
}