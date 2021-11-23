private void noEncounterRender() {
    int option = getOption();
    switch (option) {
        case 0 :
            {
                character.move(1);
                runToFieldWithEnemy(character);
                break;
            }
        case 1 :
            {
                character.move(3);
                jumpToFieldWithEnemy(character);
                break;
            }
        case 2 :
            {
                save();
                return ;
            }
        case 3 :
            {
                return ;
            }
    }
}