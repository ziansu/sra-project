private void offerQueue(java.util.Queue<com.celt.translate.business.models.Lang> queue, com.celt.translate.business.models.Lang lang) {
    if (!(queue.equals(lang))) {
        if ((queue.size()) == (com.celt.translate.data.repositories.settings.SettingsLangRepositoryImpl.QUEUE_SIZE)) {
            queue.poll();
        }
        queue.offer(lang);
    }else {
        queue.remove(lang);
        queue.offer(lang);
    }
}