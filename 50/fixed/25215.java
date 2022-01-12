public void onFailure(java.lang.Throwable caught) {
    java.lang.System.out.println(caught.getMessage());
    com.smartgwt.client.util.SC.say(caught.getMessage());
}