@java.lang.Override
public int getColWidth(int col) {
    if ((col > 0) && ((colW.length) >= col)) {
        return colW[(col - 1)];
    }else {
        return defColW;
    }
}