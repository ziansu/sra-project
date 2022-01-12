@java.lang.Override
public java.lang.Integer[] load(com.garethahealy.springboot.gameoflife.core.entities.GameBoard board) {
    java.lang.String csv = loadCsv();
    lines = org.apache.commons.lang3.StringUtils.split(csv, org.apache.commons.io.IOUtils.LINE_SEPARATOR);
    java.lang.Integer height = lines.length;
    java.lang.Integer width = org.apache.commons.lang3.StringUtils.split(lines[0], ',').length;
    return new java.lang.Integer[]{ width , height };
}