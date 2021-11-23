public java.lang.String getFilePattern() {
    java.lang.System.out.println(("FileType: " + (m_scriptType)));
    switch (m_scriptType) {
        case "Python" :
            return "/(\\.|\\/)(python|jython|py|jy|txt)$/";
        case "Groovy" :
        default :
            return "/(\\.|\\/)(groovy|gvy|gy|gsh|txt)$/";
    }
}