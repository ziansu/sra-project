public static int getMoney(org.bukkit.entity.Player p) {
    if (de.darkdevs.cp.utils.MoneyHandler.userExists(p)) {
        try {
            java.sql.ResultSet rs = de.darkdevs.cp.utils.MySQL.getResult((("SELECT Money FROM Players WHERE UUID='" + (p.getUniqueId().toString())) + "'"));
            if (rs.next()) {
                return rs.getInt("Money");
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    return 0;
}