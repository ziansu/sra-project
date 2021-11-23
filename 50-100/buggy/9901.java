private void setCelebFields(com.example.jeka.movieshelper.model.Celebrity celebrity, java.lang.String jsonValue, java.lang.String value) {
    switch (jsonValue) {
        case com.example.jeka.movieshelper.network.CelebFetch.PERSON_NAME :
            celebrity.setName(value);
            break;
        case com.example.jeka.movieshelper.network.CelebFetch.PERSON_ALSO_KNOW_AS :
            celebrity.setAlsoKnownAs(new java.lang.String[]{ value });
            break;
        case com.example.jeka.movieshelper.network.CelebFetch.PERSON_BIRTHDAY :
            celebrity.setBirthday(value);
            break;
        case com.example.jeka.movieshelper.network.CelebFetch.PERSON_PLACE_OF_BIRTH :
            celebrity.setPlaceOfBirth(value);
            break;
        case com.example.jeka.movieshelper.network.CelebFetch.PERSON_BIOGRAPHY :
            celebrity.setBiography(value);
            break;
        case com.example.jeka.movieshelper.network.CelebFetch.PERSON_HOMEPAGE :
            celebrity.setHomepage(value);
            break;
    }
}