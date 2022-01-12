public java.lang.Boolean chooseTemplate(java.lang.String templateType) {
    try {
        switch (templateType) {
            case "man_birthday" :
                fillBirthdayManTemplate();
                break;
            case "woman_birthday" :
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