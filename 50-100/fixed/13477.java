protected void setMaxCardNumber(retrofit.Response<java.lang.Integer[]> cardIdResponse) {
    java.util.List<java.lang.Integer> cardIdList = java.util.Arrays.asList(cardIdResponse.body());
    if ((cardIdList.size()) > 0) {
        java.lang.String lastCardId = cardIdList.get(((cardIdList.size()) - 1)).toString();
        com.thoughtworks.lhli.lovelive_rock.LoveLiveApp.getInstance().setMaxCardNumber(lastCardId);
    }
}