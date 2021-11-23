private void spawnRocks() {
    com.badlogic.gdx.math.Rectangle rock = new com.badlogic.gdx.math.Rectangle();
    rock.x = com.badlogic.gdx.math.MathUtils.random(0, ((Gdx.graphics.getWidth()) - 64));
    rock.y = Gdx.graphics.getHeight();
    rock.width = rockpicture.getWidth();
    rock.height = rockpicture.getHeight();
    rocksarray.add(rock);
    lastRockTime = com.badlogic.gdx.utils.TimeUtils.nanoTime();
}