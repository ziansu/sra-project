public int getBoardSwitchId(int boardSwitchId) {
    java.sql.ResultSet setBoardSwitch;
    int switchId = 0;
    setBoardSwitch = this.select((("SELECT switch_id FROM board_switches WHERE id = '" + boardSwitchId) + "'"));
    try {
        setBoardSwitch.first();
        switchId = setBoardSwitch.getInt("switch_id");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "Error al obtener el id del interruptor");
    }
    return switchId;
}