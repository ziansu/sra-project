@java.lang.Override
public zombiewar.intf.ICharacter make(java.lang.String type) {
    switch (type) {
        case "soldier" :
            return new zombiewar.impl.Soldier();
        case "tank" :
            return new zombiewar.impl.Tank();
    }
    return null;
}