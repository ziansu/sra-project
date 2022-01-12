public java.lang.String getFile() {
    if ((_level) == 0) {
        java.util.Random level_randomizer = new java.util.Random();
        _level = (level_randomizer.nextInt(6)) + 1;
    }
    switch (_level) {
        case 1 :
            return "numbers.txt";
        case 2 :
            return "days.txt";
        case 3 :
            return "months.txt";
        case 4 :
            return "us_states.txt";
        case 5 :
            return "us_state_capitals.txt";
        case 6 :
            return "nato_photonetic_alphabet.txt";
        default :
            return "no_file";
    }
}