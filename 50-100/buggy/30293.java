@java.lang.Override
public model.Item load(java.io.File f, int lr) {
    if (lr == (view.UI.Position.LEFT)) {
        return this.loadLeft(f);
    }else
        if (lr == (view.UI.Position.RIGHT)) {
            return this.loadRight(f);
        }else {
            return null;
        }
    
}