private void noEncounterRender() {
    int option = getOption();
    switch (option) {
        case 0 :
            runToFieldWithEnemy(character);
            break;
        case 1 :
            jumpToFieldWithEnemy(character);
            break;
        case 2 :
            save();
            return ;
        default :
            return ;
    }
}