@java.lang.Override
public int getColWidth(int col) {
    if ((colW.length) >= col) {
        return colW[(col - 1)];
    }else {
        return defColW;
    }
}