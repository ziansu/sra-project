private int CalcPortOut() {
    int selactive = (sel) ^ (sel2);
    int selValCombine = (((sel) & (selValue)) | ((sel2) & (selValue2))) & selactive;
    int outVal = (~selactive) & (out);
    return (selValCombine | (outVal & (dir))) & 255;
}