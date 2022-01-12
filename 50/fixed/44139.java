private boolean deleteProfile() {
    boolean status = false;
    java.lang.System.out.println("Are you sure .?? Y/N");
    java.lang.String answer = socialNetwork.index.action.EditProfile.scan.next();
    if ("Y".equalsIgnoreCase(answer)) {
        status = true;
    }
    return status;
}