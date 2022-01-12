public static db.UserFileIO init(java.lang.String filename, boolean isNewUser) throws main.Exceptions {
    if ((db.UserFileIO.self) != null)
        throw new main.Exceptions(main.Exceptions.XC.INSTANCE_ALREADY_EXISTS);
    
    db.UserFileIO.self = new db.UserFileIO(filename, isNewUser);
    return db.UserFileIO.self;
}