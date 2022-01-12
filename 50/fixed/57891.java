public com.runner.sportsmeter.enums.Gender getGenderValue(int val) {
    switch (val) {
        case 0 :
            return com.runner.sportsmeter.enums.Gender.NOT_SET;
        case 1 :
            return com.runner.sportsmeter.enums.Gender.MALE;
        case 2 :
            return com.runner.sportsmeter.enums.Gender.FEMALE;
    }
    throw new java.lang.RuntimeException(("Sport Type value not supported " + val));
}