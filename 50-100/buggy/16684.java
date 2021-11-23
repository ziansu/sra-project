public void actionPerformed(java.awt.event.ActionEvent ev) {
    if (ev.getActionCommand().equals("UserList")) {
        new fhj.shelf.UI.UserRepositorySwing(repository);
    }else
        if (ev.getActionCommand().equals("ShelfList")) {
            new fhj.shelf.UI.ShelfRepositorySwing(repository, shelfRepository);
        }else
            if (ev.getActionCommand().equals("Book")) {
                new fhj.shelf.UI.Book(repository, shelfRepository, elementsRepository);
            }
        
    
}