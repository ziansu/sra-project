@org.springframework.web.bind.annotation.RequestMapping(value = "/activitySubscriptions/{pk}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public boolean deleteActivitySubscription(@org.springframework.web.bind.annotation.PathVariable
long pk) throws org.xcolab.service.activities.exceptions.NotFoundException {
    this.activitySubscriptionDao.delete(pk);
    return true;
}