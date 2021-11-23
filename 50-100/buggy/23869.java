private void switchGenderType(ch.bfh.btx8053.w2016.white.HVmanager.util.GenderType gendertype) {
    switch (genderType) {
        case MALE :
            this.genderType = ch.bfh.btx8053.w2016.white.HVmanager.util.GenderType.MALE;
            break;
        case FEMALE :
            this.genderType = ch.bfh.btx8053.w2016.white.HVmanager.util.GenderType.FEMALE;
            break;
        case OTHER :
            this.genderType = ch.bfh.btx8053.w2016.white.HVmanager.util.GenderType.OTHER;
            break;
        case UNKOWN :
            this.genderType = ch.bfh.btx8053.w2016.white.HVmanager.util.GenderType.UNKOWN;
            break;
    }
}