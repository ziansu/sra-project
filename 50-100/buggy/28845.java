public void cancel(fr.emn.fil.reservation.model.entities.User user, java.lang.Long id) throws fr.emn.fil.reservation.model.exceptions.GenericError {
    fr.emn.fil.reservation.model.entities.Reservation reservation = reservationDAO.byId(id);
    if (reservation == null)
        throw new fr.emn.fil.reservation.model.exceptions.GenericError("La r�servation que vous voulez supprimer n'existe plus");
    
    if (reservation.getUser().equals(user))
        reservationDAO.delete(reservation);
    else
        throw new fr.emn.fil.reservation.model.exceptions.ModelError("Erreur d'annulation : vous essayer de supprimer une r�servation qui ne vous appartient pas");
    
}