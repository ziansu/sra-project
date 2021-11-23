public final void applyTransformation(eu.modernmt.model.Word source) {
    if ((this.transformation) == null) {
        if ((source == null) || (!(source.placeholder.equals(this.placeholder))))
            this.text = this.placeholder;
        else
            this.text = source.text;
        
    }else {
        this.transformation.apply(source, this);
        if ((this.text) == null)
            this.text = this.placeholder;
        
    }
}