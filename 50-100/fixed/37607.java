@java.lang.Override
public void onDied(dk.sdu.mmmi.cbse.project1.events.Events.DieEvent dieEvent) {
    float x = body.x;
    float y = body.y;
    float angle = body.angle;
    for (dk.sdu.mmmi.cbse.project1.events.Events.IEntityListener listener : listenerList) {
        listener.onCreate(new dk.sdu.mmmi.cbse.project1.events.Events.CreateEvent(this, new dk.sdu.mmmi.cbse.project1.asteroids.asteroid.MediumAsteroid(x, y, (angle - 1.0F))));
        listener.onCreate(new dk.sdu.mmmi.cbse.project1.events.Events.CreateEvent(this, new dk.sdu.mmmi.cbse.project1.asteroids.asteroid.MediumAsteroid(x, y, (angle + 1.0F))));
        listener.onDetroy(new dk.sdu.mmmi.cbse.project1.events.Events.DestroyEvent(this));
    }
}