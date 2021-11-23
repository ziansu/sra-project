private void SetCommonHeaders() {
    this.response.setDate(com.epam.rest.helper.DateHelper.getDateStr());
    this.response.setServer(com.epam.rest.handler.SERVER_STR);
    this.response.setContentLanguage("en");
}