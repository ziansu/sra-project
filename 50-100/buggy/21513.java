@java.lang.Override
public java.lang.String getZplCode(fr.w3blog.zpl.model.PrinterOptions printerOptions) {
    java.lang.StringBuilder zpl = getStartZplCodeBuilder();
    zpl.append(fr.w3blog.zpl.utils.ZplUtils.zplCommandSautLigne("BC", zebraRotation.getLetter(), barCodeHeigth, checkDigit43, showTextInterpretation, showTextInterpretationAbove));
    zpl.append("^FD");
    zpl.append(text);
    zpl.append(fr.w3blog.zpl.utils.ZplUtils.zplCommandSautLigne("FS"));
    return zpl.toString();
}