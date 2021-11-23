public int getBoardSwitchId(int switchId) {
    java.sql.ResultSet setBoardSwitch;
    int boardSwitchId = 0;
    setBoardSwitch = this.select((("SELECT switch_id FROM board_switches WHERE id = '" + switchId) + "'"));
    try {
        setBoardSwitch.first();
        boardSwitchId = setBoardSwitch.getInt("switch_id");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "Error al obtener el id del interruptor");
    }
    return boardSwitchId;
}