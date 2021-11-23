public static java.lang.Short localeStringToId(java.lang.String localeString) {
    switch (localeString) {
        case "de" :
            return lt.pap.bean.ApplicationBean.GERMAN_ID;
        case "en" :
            return lt.pap.bean.ApplicationBean.ENGLISH_ID;
        case "lt" :
            return lt.pap.bean.ApplicationBean.LITHUANIAN_ID;
        case "ru" :
            return lt.pap.bean.ApplicationBean.RUSSIAN_ID;
        default :
            return lt.pap.bean.ApplicationBean.ENGLISH_ID;
    }
}