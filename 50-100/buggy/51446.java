public static void updateScreen(int section, javax.swing.ImageIcon buffer) {
    java.lang.System.out.println(section);
    switch (section) {
        case 1 :
            main.AltUI.picLabel_1.setIcon(buffer);
            break;
        case 2 :
            main.AltUI.picLabel_2.setIcon(buffer);
            break;
        case 3 :
            main.AltUI.picLabel_3.setIcon(buffer);
            break;
        case 4 :
            main.AltUI.picLabel_4.setIcon(buffer);
            break;
    }
}