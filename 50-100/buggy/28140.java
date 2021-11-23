@java.lang.Override
public java.lang.Object clone() {
    GameOfLife.Model.GameBoard gameBoardCopy;
    try {
        gameBoardCopy = ((GameOfLife.Model.GameBoard) (super.clone()));
        gameBoardCopy.rules = ((GameOfLife.Model.Rules) (rules.clone()));
        gameBoardCopy.cellColor = this.getColor();
    } catch (java.lang.CloneNotSupportedException e) {
        java.lang.System.out.println(e.getMessage());
        java.lang.System.out.println("FAKKK");
        return null;
    }
    return gameBoardCopy;
}