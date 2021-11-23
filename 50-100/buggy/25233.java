@java.lang.Override
public void cleanup(lamao.soh.core.SHScene scene) {
    lamao.soh.core.entities.SHPaddle paddle = scene.getEntity("paddle", "paddle", lamao.soh.core.entities.SHPaddle.class);
    paddle.setHitHandler(new lamao.soh.core.SHDefaultPaddleHitHandler());
    for (com.jme3.scene.Spatial entity : scene.get("ball")) {
        lamao.soh.core.entities.SHBall ball = ((lamao.soh.core.entities.SHBall) (entity));
        ball.removeControl(lamao.soh.core.controllers.SHPaddleSticker.class);
        ball.addControl(new lamao.soh.core.controllers.SHDefaultBallMover(ball));
    }
}