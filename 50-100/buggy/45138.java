@java.lang.Override
public int randomRespawnCell() {
    int cell = (entrance) + (NEIGHBOURS8[com.watabou.utils.Random.Int(8)]);
    while (!(passable[cell])) {
        cell = (entrance) + (NEIGHBOURS8[com.watabou.utils.Random.Int(8)]);
    } 
    return cell;
}