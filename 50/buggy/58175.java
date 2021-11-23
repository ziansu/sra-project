public static GUI.Configurations getInstance() {
    if ((GUI.Configurations.ourConfigs) == null) {
        GUI.Configurations.ourConfigs = new GUI.Configurations("c:\\User1\\Documents\\Lab2-1\\bin", "java.io.Reader,java.io.BufferedReader,java.lang.Runtime,org.asm.ClassVisitor", "C:\\Users\\cookmn\\Documents\\GitHub\\CSSE374Misfits\\docs\\Image", "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe", "UMLClasses.DecoratorDetector Singleton-Detector", GUI.Configurations.myArray);
    }
    return GUI.Configurations.ourConfigs;
}