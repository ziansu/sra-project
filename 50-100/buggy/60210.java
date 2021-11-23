@java.lang.Override
public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
    edu.chl.proximity.Models.BoardObject clone = ((edu.chl.proximity.Models.BoardObject) (super.clone()));
    clone.setPosition(new com.badlogic.gdx.math.Vector2(position.x, position.y));
    clone.setImage(((edu.chl.proximity.Models.Models.Utils.Image) (image.clone())));
    return clone;
}