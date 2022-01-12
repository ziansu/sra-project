@java.lang.Override
public boolean sendPaymentReminder(int uid, int sid, boolean type, int cuid) {
    com.udoo.dal.entities.Payment payment = paymentRepository.findTopByUidAndSidAndTypeAndStateOrderByPidDesc(uid, sid, type, STATE_RESERVE);
    return (type ? (offerRepository.findByOid(sid).getUid()) == cuid : (requestRepository.findByRid(sid).getUid()) == cuid) && (this.savePayment(payment, STATE_REMIND));
}