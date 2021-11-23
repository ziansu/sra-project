private java.lang.String getFooter() {
    if ((footer) == null) {
        setFooter(((("End of " + (getName())) + " ") + (msi.gama.outputs.FileOutput.sdf.format(java.util.Calendar.getInstance().getTime()))));
    }
    return header;
}