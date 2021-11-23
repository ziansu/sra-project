@java.lang.Override
public edu.chalmers.zombie.adapter.Zombie spawn(com.badlogic.gdx.physics.box2d.World world, edu.chalmers.zombie.utils.ZombieType type, int x, int y) {
    return new edu.chalmers.zombie.testing.ZombieTest(world, x, y);
}