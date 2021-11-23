public final void setName(final java.lang.String name) throws wolf.mindset.ObjectAlreadyExistsException {
    for (final wolf.mindset.MindsetObject object : wolf.mindset.MindsetObject.ALL_OBJECTS)
        if (((object != (this)) && (object.getType().equals(getType()))) && (object.name.get().equals(name)))
            throw new wolf.mindset.ObjectAlreadyExistsException(this, object);
        
    
    this.name.set(name);
}