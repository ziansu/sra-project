public static void info(java.lang.String str, boolean skipLine) {
    fr.epita.pri.rackrepresentator.main.Console.txtArea.append(str);
    if (skipLine)
        fr.epita.pri.rackrepresentator.main.Console.txtArea.append("\n");
    
}