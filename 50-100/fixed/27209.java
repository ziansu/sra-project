@java.lang.Override
public void wui() {
    ic.commitText(java.lang.String.valueOf(automata.execute(new int[]{ -1 , D_DOWN , -1 , -1 , -1 }, ic)), 1);
    ic.commitText(java.lang.String.valueOf(automata.execute(new int[]{ -1 , D_DOWN , D_DOWN , D_DOWN , -1 }, ic)), 1);
}