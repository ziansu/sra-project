private static com.whippy.tas.premier.beans.Stats setTacklingStat(java.util.List<com.whippy.tas.premier.beans.Position> positions, java.util.Random rand, com.whippy.tas.premier.beans.Stats stats) {
    if (positions.contains(Position.DEFENSE)) {
        stats.setTackling(com.whippy.tas.premier.util.Utils.getGaussian(80, 10));
    }else
        if (positions.contains(Position.MIDFIELD)) {
            stats.setTackling(com.whippy.tas.premier.util.Utils.getGaussian(60, 20));
        }else {
            stats.setTackling(com.whippy.tas.premier.util.Utils.getGaussian(40, 40));
        }
    
    return stats;
}