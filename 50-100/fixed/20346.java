@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String choice = "";
    if ((game_combo.getSelectedIndex()) != (-1))
        choice = game_combo.getItemAt(game_combo.getSelectedIndex());
    
    switch (choice) {
        case "Pacman" :
            new pacman.Pacman_Frame(frame);
    }
}