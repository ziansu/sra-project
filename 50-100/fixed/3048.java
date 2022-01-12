private void spawnRocks() {
    com.badlogic.gdx.math.Rectangle rock = new com.badlogic.gdx.math.Rectangle();
    rock.width = rockpicture.getWidth();
    rock.height = rockpicture.getHeight();
    rock.x = com.badlogic.gdx.math.MathUtils.random(0, ((Gdx.graphics.getWidth()) - (rock.width)));
    rock.y = Gdx.graphics.getHeight();
    rocksarray.add(rock);
    lastRockTime = com.badlogic.gdx.utils.TimeUtils.nanoTime();
}