@java.lang.Override
public void regFieldObserver(minesweeper.IFieldObserver fo) {
    fos.add(fo);
    fo.update();
}