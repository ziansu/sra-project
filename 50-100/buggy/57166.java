@java.lang.Override
public soliddomino.game.movement.Movement answerValidation(java.lang.String answer) throws java.lang.NumberFormatException, soliddomino.game.exceptions.IncorrectMoveFormatException, soliddomino.game.exceptions.WrongDirectionException {
    soliddomino.game.movement.Movement movement = null;
    if (answer.equalsIgnoreCase("pass")) {
        movement = new soliddomino.game.movement.Movement(true);
    }else {
        java.lang.String[] array = answer.split("-");
        if ((array.length) < 2) {
            throw new soliddomino.game.exceptions.IncorrectMoveFormatException(answer);
        }
        int index = java.lang.Integer.parseInt(array[0]);
        movement = buildMovement(index, answer);
    }
    return movement;
}