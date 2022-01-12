public void initControllerEmails() throws org.json.JSONException {
    emailDAO = gppmds.wikilegis.dao.EmailDAO.getInstance(context);
    if (emailDAO.isDatabaseEmpty()) {
        emailDAO = ((gppmds.wikilegis.dao.EmailDAO) (gppmds.wikilegis.dao.JSONHelper.emailListFromJSON(gppmds.wikilegis.controller.RegisterUserController.emailList)));
        emailDAO.insertAllEmails(gppmds.wikilegis.controller.RegisterUserController.emailList);
    }else {
        gppmds.wikilegis.controller.RegisterUserController.emailList = emailDAO.getAllEmails();
    }
}