public java.lang.Boolean chooseTemplate(java.lang.String templateType) {
    java.lang.System.out.println("HERE");
    try {
        switch (templateType) {
            case "man_birthday" :
                java.lang.System.out.println("1");
                fillBirthdayManTemplate();
                break;
            case "woman_birthday" :
                java.lang.System.out.println("2");
                fillBirthdayWomanTemplate();
                break;
            case "email" :
                fillEmailTemplate();
                break;
        }
    } catch (java.net.URISyntaxException | java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}