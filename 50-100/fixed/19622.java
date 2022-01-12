public void checkmoney(GUI.User user, int jewel, int money) {
    if ((user.yen) < money) {
        javax.swing.JOptionPane.showMessageDialog(a, "���� �����մϴ�", " ���� ���", javax.swing.JOptionPane.ERROR_MESSAGE);
    }else {
        user.jewel += jewel;
        user.yen -= money;
        this.refresh();
    }
}