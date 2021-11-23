public static void optionMethod() {
    MethodsGUI.panel1.setVisible(false);
    MethodsGUI.back.setVisible(true);
    MethodsGUI.difficultySetting.setVisible(true);
    MethodsGUI.setting.setVisible(true);
    MethodsGUI.panel4.setVisible(true);
    MethodsGUI.frame1.add(MethodsGUI.panel4);
    MethodsGUI.back.addActionListener(new MainClass.back());
    (MethodsGUI.runcount)++;
    java.lang.System.out.println(MethodsGUI.runcount);
}