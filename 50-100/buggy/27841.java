@java.lang.Override
public java.util.List<coderdojo.bots.robobrain.EnemyInfo> filter(java.util.Collection<coderdojo.bots.robobrain.EnemyInfo> enemies) {
    java.util.List<coderdojo.bots.robobrain.EnemyInfo> shooters = new java.util.ArrayList<coderdojo.bots.robobrain.EnemyInfo>();
    for (coderdojo.bots.robobrain.EnemyInfo enemyInfo : enemies) {
        if ((enemyInfo.getShotMe()) != null) {
            shooters.add(enemyInfo);
        }
        java.util.Comparator<coderdojo.bots.robobrain.EnemyInfo> comparator = new coderdojo.bots.robobrain.comparators.MostRecentEnemyEventComparator(robocode.HitByBulletEvent.class);
        java.util.Collections.sort(shooters, comparator);
    }
    return shooters;
}